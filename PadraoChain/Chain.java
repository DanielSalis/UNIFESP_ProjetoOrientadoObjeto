public class Chain {
    ProcessorString chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain = new SpacesProcessor(new AProcessor(new PointProcessor(new OtherLettersProcessor(null))));
    }

    public void process(Text request) {
        chain.process(request);
    }

    public void printCounters(){
        System.out.println("\nContador de espaços: "+chain.spaceCounter);
        System.out.println("\nContador de a's: "+chain.aCounter);
        System.out.println("\nContador de pontos: "+chain.pointCounter);
    }

}

abstract class ProcessorString {
    private ProcessorString processor;

    public int spaceCounter = 0;
    public int aCounter = 0;
    public int pointCounter = 0;

    public ProcessorString(ProcessorString processor) {
        this.processor = processor;
    };

    public void countString(Character character){

        if(character == 'a'){
            aCounter++;
            return ;
        }

        if(character == '.'){
            pointCounter++;
            return ;
        }
    }

    public void process(Text request) {
        Character c = request.getText();
        countString(c);
        processor.process(request);
    };
}

class Text {
    private Character text = ' ';

    public Text(Character t) {
        if(t.toString().charAt(0) == ' '){
            t = ' ';
        }
        this.text = t;
    }

    public Character getText() {

        if((char) text == (char) ' '){
            return ' '; 
        }

        return this.text;
    }

}

class SpacesProcessor extends ProcessorString {
    public SpacesProcessor(ProcessorString processor) {
        super(processor);
    }

    public void process(Text request) {
        if (request.getText() == ' ') {
            spaceCounter++;
            System.out.println("SpacesProcessor : " + request.getText());
        } else {
            super.process(request);
        }
    }
}

class AProcessor extends ProcessorString {
    public AProcessor(ProcessorString processor) {
        super(processor);
    }

    public void process(Text request) {
        if (request.getText() == 'a') {
            System.out.println("AProcessor : " + request.getText());
        } else {
            super.process(request);
        }
    }
}

class PointProcessor extends ProcessorString {

    public PointProcessor(ProcessorString processor) {
        super(processor);
    }

    public void process(Text request) {
        if (request.getText() == '.') {
            System.out.println("PointProcessor : " + request.getText());
        } else {
            super.process(request);
        }
    }
}

class OtherLettersProcessor extends ProcessorString {

    public OtherLettersProcessor(ProcessorString processor) {
        super(processor);
    }

    public void process(Text request) {
        if (request.getText() != '.' || request.getText() != 'a' || request.getText() != ' ') {
            System.out.println("OtherLettersProcessor : " + request.getText());
        } else {
            super.process(request);
        }
    }
}
