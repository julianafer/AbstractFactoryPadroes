package br.edu.ifpb.pweb2.praticas.factory;

import br.edu.ifpb.pweb2.praticas.button.ButtonMacOS;
import br.edu.ifpb.pweb2.praticas.checkbox.CheckboxMacOS;
import br.edu.ifpb.pweb2.praticas.textarea.TextArea;
import br.edu.ifpb.pweb2.praticas.button.Button;
import br.edu.ifpb.pweb2.praticas.checkbox.Checkbox;
import br.edu.ifpb.pweb2.praticas.textarea.TextAreaMacOS;

public class GUIConcreteFactoryMacOS implements GUIAbstractFactory {
    @Override
    public Button criarButton() {
        return new ButtonMacOS();
    }

    @Override
    public TextArea criarTextArea() {
        return new TextAreaMacOS();
    }

    @Override
    public Checkbox criarCheckbox() {
        return new CheckboxMacOS();
    }
}
