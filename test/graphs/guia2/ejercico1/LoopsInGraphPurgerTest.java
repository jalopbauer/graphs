package graphs.guia2.ejercico1;

import graphs.Graph;
import graphs.implementations.AdjacencyMatrixGraph;
import guia2.ejercicio1.GetIsolatedVertexes;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetIsolatedVertexesTest {

    GetIsolatedVertexes getIsolatedVertexes = new GetIsolatedVertexes();

    @Test
    public void testEmptyGraphReturnsEmptyList() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        assertTrue(getIsolatedVertexes.get(graph).isEmpty());
    }

    @Test
    public void testSingleIsolatedVertexGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        List<String> expected = new ArrayList<>();
        expected.add("Nice");
        List<String> actual = getIsolatedVertexes.get(graph);
        assertTrue(compareStringArrays(expected.toArray(new String[1]),actual.toArray(new String[1])));
    }

    @Test
    public void testDoubleVertexGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        List<String> expected = new ArrayList<>();
        expected.add("Nice");
        expected.add("Toit");
        List<String> actual = getIsolatedVertexes.get(graph);
        assertTrue(compareStringArrays(expected.toArray(new String[2]),actual.toArray(new String[2])));
    }

    @Test
    public void testTripleVertexOneIsolatedGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        graph.addVertex("Peralta");
        graph.addEdge(1,2);
        List<String> expected = new ArrayList<>();
        expected.add("Nice");
        List<String> actual = getIsolatedVertexes.get(graph);
        assertTrue(compareStringArrays(expected.toArray(new String[1]),actual.toArray(new String[1])));
    }

    private static boolean compareStringArrays(String[] strings, String[] strings1) {
        Arrays.sort(strings);
        Arrays.sort(strings1);
        return 0 == Arrays.compare(strings, strings1);
    }
}

