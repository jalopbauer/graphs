import graphs.Graph;
import graphs.implementations.AdjacencyMatrixGraph;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteVertex {

    @Test
    public void whenVertexIsRemovedOrderDecreasesToOne() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Esteban");
        graph.addVertex("Puto");
        graph.addVertex("no es");
        graph.addEdge(1,2);
        graph.addEdge(1,2);
        graph.deleteVertex(1);
        assertEquals(1, graph.order());
    }


}
