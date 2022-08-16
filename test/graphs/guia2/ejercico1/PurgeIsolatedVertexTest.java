package graphs.guia2.ejercico1;

import graphs.Graph;
import graphs.implementations.AdjacencyMatrixGraph;
import guia2.ejercicio1.IsolatedVertex;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PurgeIsolatedVertexTest {

    IsolatedVertex isolatedVertex = new IsolatedVertex();

    @Test
    public void testVertexIsolated() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        assertTrue(isolatedVertex.isVertexIsolated(graph,"Nice"));
    }

    @Test
    public void testVertexWithLoopIsolated() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addEdge(0,0);
        assertTrue(isolatedVertex.isVertexIsolated(graph,"Nice"));
    }

    @Test
    public void testVertexIsNotIsolated() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        graph.addEdge(0,1);
        assertFalse(isolatedVertex.isVertexIsolated(graph,"Nice"));
    }

    @Test
    public void testVertexIsNotIsolatedButHasLoop() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        graph.addEdge(0,1);
        graph.addEdge(0,0);
        assertFalse(isolatedVertex.isVertexIsolated(graph,"Nice"));
    }
//
//

//
//    @Test
//    public void testOneOneEdgeGraph() {
//        Graph<String> graph = new AdjacencyMatrixGraph<>();
//        graph.addVertex("Nice");
//        graph.addVertex("Toit");
//        graph.addEdge(0,1);
//        String[] expectedValues = {};
//        String[] generated = arrayOfVertexWithLoop.generate(graph);
//        assertTrue(compareStringArrays(expectedValues, generated));
//    }
//
//    @Test
//    public void testThreeOneOneEdgeTwoLoopEdgeGraph() {
//        Graph<String> graph = new AdjacencyMatrixGraph<>();
//        graph.addVertex("Nice");
//        graph.addVertex("Toit");
//        graph.addVertex("Peralta");
//        graph.addEdge(0,1);
//        graph.addEdge(0,2);
//        graph.addEdge(1,2);
//        graph.addEdge(1,1);
//        graph.addEdge(2,2);
//        String[] expectedValues = {"Toit","Peralta"};
//        String[] generated = arrayOfVertexWithLoop.generate(graph);
//        assertTrue(compareStringArrays(expectedValues, generated));
//    }
//
//    @Test
//    public void testThreeLoopEdgeGraph() {
//        Graph<String> graph = new AdjacencyMatrixGraph<>();
//        graph.addVertex("Nice");
//        graph.addVertex("Toit");
//        graph.addVertex("Peralta");
//        graph.addEdge(0,0);
//        graph.addEdge(1,1);
//        graph.addEdge(2,2);
//        String[] expectedValues = {"Nice","Toit","Peralta"};
//        String[] generated = arrayOfVertexWithLoop.generate(graph);
//        assertTrue(compareStringArrays(expectedValues, generated));
//    }
//
//    private static boolean compareStringArrays(String[] strings, String[] strings1) {
//        Arrays.sort(strings);
//        Arrays.sort(strings1);
//        return 0 == Arrays.compare(strings, strings1);
//    }
}
