package br.edu.ifpb.pweb2.praticas;

import br.edu.ifpb.pweb2.praticas.button.Button;
import br.edu.ifpb.pweb2.praticas.checkbox.Checkbox;
import br.edu.ifpb.pweb2.praticas.factory.GUIAbstractFactory;
import br.edu.ifpb.pweb2.praticas.textarea.TextArea;

public class Cliente {
    private Button button;
    private Checkbox checkbox;
    private TextArea textArea;

    public Cliente(GUIAbstractFactory factory) {
        button = factory.criarButton();
        checkbox = factory.criarCheckbox();
        textArea = factory.criarTextArea();
    }

    public void render() {
        button.render();
        checkbox.render();
        textArea.render();
    }
}
