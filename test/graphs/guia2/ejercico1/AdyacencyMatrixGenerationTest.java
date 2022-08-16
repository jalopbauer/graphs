package graphs.guia2.ejercico1;

import graphs.Graph;
import graphs.implementations.AdjacencyMatrixGraph;
import guia2.ejercicio1.LoopCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdyacencyMatrixGenerationTest {

    LoopCounter loopCounter = new LoopCounter();
    @Test
    public void testEmptyGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        assertEquals(0,loopCounter.countLoops(graph));
    }

    @Test
    public void testOneLoopEdgeGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addEdge(0,0);
        assertEquals(1,loopCounter.countLoops(graph));
    }

    @Test
    public void testOneOneEdgeOneLoopGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        graph.addEdge(0,1);
        assertEquals(0,loopCounter.countLoops(graph));
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
        assertEquals(2,loopCounter.countLoops(graph));
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
        assertEquals(3,loopCounter.countLoops(graph));
    }
}
