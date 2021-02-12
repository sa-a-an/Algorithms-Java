package graphsalgorithm.primamst;

public class Edge implements Comparable<Edge>{

    private final Vertex from;
    private final Vertex to;
    private final int weight;

    public Edge(Vertex from, Vertex to, int weight){
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public Vertex getFrom() {
        return this.from;
    }

    public Vertex getTo() {
        return this.to;
    }

    @Override
    public String toString() {
        return "Начало - " + from + ". Конец - " + to + ". Вес - " + weight;
    }

    @Override
    public int compareTo(Edge o) {
        return weight - o.getWeight();
    }
}
