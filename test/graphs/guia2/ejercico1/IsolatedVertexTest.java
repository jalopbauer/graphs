package graphs.guia2.ejercico1;

import graphs.Graph;
import graphs.implementations.AdjacencyMatrixGraph;
import guia2.ejercicio1.ArrayOfVertexWithLoop;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IsolatedVertexTest {

    ArrayOfVertexWithLoop arrayOfVertexWithLoop = new ArrayOfVertexWithLoop();

    @Test
    public void testEmptyGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        assertEquals(0,arrayOfVertexWithLoop.generate(graph).length);
    }

    @Test
    public void testOneLoopEdgeGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addEdge(0,0);
        String[] expectedValues = {"Nice"};
        String[] generated = arrayOfVertexWithLoop.generate(graph);
        assertTrue(compareStringArrays(expectedValues, generated));
    }

    @Test
    public void testOneOneEdgeGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        graph.addEdge(0,1);
        String[] expectedValues = {};
        String[] generated = arrayOfVertexWithLoop.generate(graph);
        assertTrue(compareStringArrays(expectedValues, generated));
    }

    @Test
    public void testThreeOneOneEdgeTwoLoopEdgeGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        graph.addVertex("Peralta");
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,1);
        graph.addEdge(2,2);
        String[] expectedValues = {"Toit","Peralta"};
        String[] generated = arrayOfVertexWithLoop.generate(graph);
        assertTrue(compareStringArrays(expectedValues, generated));
    }

    @Test
    public void testThreeLoopEdgeGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        graph.addVertex("Peralta");
        graph.addEdge(0,0);
        graph.addEdge(1,1);
        graph.addEdge(2,2);
        String[] expectedValues = {"Nice","Toit","Peralta"};
        String[] generated = arrayOfVertexWithLoop.generate(graph);
        assertTrue(compareStringArrays(expectedValues, generated));
    }

    private static boolean compareStringArrays(String[] strings, String[] strings1) {
        Arrays.sort(strings);
        Arrays.sort(strings1);
        return 0 == Arrays.compare(strings, strings1);
    }
}
