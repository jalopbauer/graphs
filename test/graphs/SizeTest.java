import graphs.Graph;
import graphs.implementations.AdjacencyMatrixGraph;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SizeTest {
    @Test
    public void whenGraphSizeIsCreatedOrderIsCero () {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        assertEquals(0,graph.order());
    }

    @Test
    public void whenVertexIsAddedOrderIncreasesToOne() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("A casa pete");
        assertEquals(1,graph.order());
    }

    @Test
    public void whenTwoVertexAreAddedOrderIncreasesToTwo() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("A casa pete");
        graph.addVertex("De una pa");
        assertEquals(2,graph.order());
    }

    @Test
    public void whenVertexIsRemovedOrderDecreasesToOne() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("A casa pete");
        graph.addVertex("De una pa");
        graph.deleteVertex(1);
        assertEquals(1, graph.order());
    }

    @Test
    public void whenVertexIsRemovedItIsEmptyDoesNothing() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.deleteVertex(1);
        assertEquals(0, graph.order());
    }
}
