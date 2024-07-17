package br.edu.ifpb.pweb2.praticas.factory;

import br.edu.ifpb.pweb2.praticas.button.ButtonWindows;
import br.edu.ifpb.pweb2.praticas.checkbox.CheckboxWindows;
import br.edu.ifpb.pweb2.praticas.textarea.TextArea;
import br.edu.ifpb.pweb2.praticas.button.Button;
import br.edu.ifpb.pweb2.praticas.checkbox.Checkbox;
import br.edu.ifpb.pweb2.praticas.textarea.TextAreaWindows;

public class GUIConcreteFactoryWindows implements GUIAbstractFactory {
    @Override
    public Button criarButton() {
        return new ButtonWindows();
    }

    @Override
    public TextArea criarTextArea() {
        return new TextAreaWindows();
    }

    @Override
    public Checkbox criarCheckbox() {
        return new CheckboxWindows();
    }
}
