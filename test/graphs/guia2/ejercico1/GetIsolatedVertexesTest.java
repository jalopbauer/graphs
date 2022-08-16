package graphs.guia2.ejercico1;

import graphs.Graph;
import graphs.implementations.AdjacencyMatrixGraph;
import guia2.ejercicio1.StringVertexes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetIsolatedVertexesTest {

    StringVertexes stringVertexes = new StringVertexes();

    @Test
    public void testEmptyGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        assertEquals("{}", stringVertexes.stringVertexes(graph));
    }

    @Test
    public void testSingleVertexGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        assertEquals("{Nice}", stringVertexes.stringVertexes(graph));
    }

    @Test
    public void testDoubleVertexGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        assertEquals("{Nice,Toit}", stringVertexes.stringVertexes(graph));
    }

    @Test
    public void testTripleVertexGraph() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Nice");
        graph.addVertex("Toit");
        graph.addVertex("Peralta");
        assertEquals("{Nice,Toit,Peralta}", stringVertexes.stringVertexes(graph));
    }
}

