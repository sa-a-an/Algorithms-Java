package graphsalgorithm.primamst;

public class Vertex {
    private String name;
    private boolean visited = false;
    private int weight = Integer.MAX_VALUE;

    public Vertex(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean getVisited() {
        return this.visited;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex vertex = (Vertex) o;

        return name.equals(vertex.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Имя вершины: " + this.name;
    }
}
