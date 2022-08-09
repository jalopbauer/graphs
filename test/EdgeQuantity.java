import graphs.Graph;
import graphs.implementations.AdjacencyMatrixGraph;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EdgeQuantity {
    @Test
    public void whenGraphSizeIsCreatedEdgeQuantityIsCero () {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        assertEquals(0,graph.edgeQuantity());
    }

    @Test
    public void whenEdgeIsAddedOrderIncreasesToOne() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Esteban");
        graph.addVertex("Puto");
        graph.addVertex("no es");
        graph.addEdge(1,2);
        assertEquals(1,graph.edgeQuantity());
    }

    @Test
    public void whenTwoEdgeAreAddedOrderIncreasesToTwo() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Esteban");
        graph.addVertex("Puto");
        graph.addVertex("no es");
        graph.addEdge(1,2);
        graph.addEdge(1,0);
        assertEquals(2,graph.edgeQuantity());
    }

    @Test
    public void whenEdgeIsRemovedOrderDecreasesToOne() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Esteban");
        graph.addVertex("Puto");
        graph.addVertex("no es");
        graph.addEdge(1,2);
        graph.addEdge(1,2);
        graph.deleteVertex(1);
        assertEquals(1, graph.edgeQuantity());
    }

    @Test
    public void whenEdgeIsRemovedItIsEmptyDoesNothing() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.deleteVertex(1);
        assertEquals(0, graph.edgeQuantity());
    }

}
