package javacup.polimorfism.practice;

public class Application {
    public static void main(String[] args) {
        Component c = new Button();
        c.show();
        if (c instanceof SelectableComponent) {
            SelectableComponent s = (SelectableComponent) c;
            s.select();
            s.show();
        }


    }
}

abstract class Component {
    public abstract void show();
}

abstract class SelectableComponent extends Component {
//    public abstract void select();
    public final void select() {
        System.out.println("Selected");
    }
}

class Button extends SelectableComponent {
//    @Override
//    public void select() {
//        System.out.println("Button Selected");
//    }

    @Override
    public void show() {
        System.out.println("Button Showed");
    }
}

class TextBox extends SelectableComponent {
//    @Override
//    public void select() {
//        System.out.println("TextBox Selected");
//    }

    @Override
    public void show() {
        System.out.println("TextBox Showed");
    }
}

