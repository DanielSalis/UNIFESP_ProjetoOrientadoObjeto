public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain();

        // Calling chain of responsibility
        chain.process(new Text('a'));
        chain.process(new Text(' '));
        chain.process(new Text('d'));
        chain.process(new Text('o'));
        chain.process(new Text('n'));
        chain.process(new Text('a'));
        chain.process(new Text(' '));
        chain.process(new Text('a'));
        chain.process(new Text('r'));
        chain.process(new Text('a'));
        chain.process(new Text('n'));
        chain.process(new Text('h'));
        chain.process(new Text('a'));
        chain.process(new Text('.'));
        chain.process(new Text(' '));
        chain.process(new Text('.'));
        chain.printCounters();

    }
}
