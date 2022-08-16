package graphs.guia2.ejercico1;

import graphs.Edge;
import graphs.Graph;
import graphs.implementations.AdjacencyMatrixGraph;
import guia2.ejercicio1.PurgeIsolatedVertex;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class PurgeIsolatedVertexTest {

    PurgeIsolatedVertex isolatedVertex = new PurgeIsolatedVertex();

    @Test
    public void testVertexIsolatedRemove() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        isolatedVertex.purge(graph);
        List<String> expectedList = new ArrayList<>();
        assertTrue(compareStringArrays(expectedList, graph.getVertexes()));
    }

    @Test
    public void testVertexIsolatedWithLoopRemove() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addEdge(0,0);
        isolatedVertex.purge(graph);
        List<String> expectedList = new ArrayList<>();
        assertTrue(compareStringArrays(expectedList, graph.getVertexes()));
    }

    @Test
    public void testAll() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        graph.addVertex("Peralta");
        graph.addVertex("Amy");
        graph.addEdge(0,0);
        graph.addEdge(2,3);
        isolatedVertex.purge(graph);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Peralta");
        expectedList.add("Amy");
        List<String> vertexes = graph.getVertexes();
        assertTrue(compareStringArrays(expectedList, vertexes));
    }



    private static boolean compareStringArrays(List<String> expectedList, List<String> actualList) {
        String[] expected = expectedList.toArray(new String[0]), actual = actualList.toArray(new String[0]);
        Arrays.sort(expected);
        Arrays.sort(actual);
        return 0 == Arrays.compare(expected, actual);
    }
}
