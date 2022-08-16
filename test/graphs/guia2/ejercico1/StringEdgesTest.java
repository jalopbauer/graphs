package graphs.guia2.ejercico1;

import graphs.Graph;
import graphs.implementations.AdjacencyMatrixGraph;
import guia2.StringEdges;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringEdgesGraph {

    StringEdges stringEdges = new StringEdges();

    @Test
    public void testEmptyGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        assertEquals("{}", stringEdges.stringEdges(graph));
    }

    @Test
    public void testLoopEdgeGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addEdge(0,0);
        assertEquals("{{Nice,Nice}}", stringEdges.stringEdges(graph));
    }

    @Test
    public void testOneOneEdgeGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        graph.addEdge(0,1);
        assertEquals("{{Nice,Toit}}", stringEdges.stringEdges(graph));
    }

    @Test
    public void testThreeOneOneEdgesOneLoopEdgeGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        graph.addVertex("Peralta");
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,2);
        String resultStringEdges = stringEdges.stringEdges(graph);
        assertTrue(resultStringEdges.contains("{Nice,Toit}"));
        assertTrue(resultStringEdges.contains("{Nice,Peralta}"));
        assertTrue(resultStringEdges.contains("{Toit,Peralta}"));
        assertTrue(resultStringEdges.contains("{Peralta,Peralta}"));

    }
}
