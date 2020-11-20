package org.example.buttons;

public class HtmlButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Click! Button Says Hello World");
    }

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
    }
}
