package graphs.guia2.ejercico1;

import graphs.Graph;
import graphs.implementations.AdjacencyMatrixGraph;
import guia2.ejercicio1.VertexWithLoopList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOfVertexWithLoopTest {

    VertexWithLoopList vertexWithLoopList = new VertexWithLoopList();

    @Test
    public void testEmptyGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        
    }

    @Test
    public void testOneLoopEdgeGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addEdge(0,0);
    }

    @Test
    public void testOneOneEdgeOneLoopGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        graph.addEdge(0,1);
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
    }
}
