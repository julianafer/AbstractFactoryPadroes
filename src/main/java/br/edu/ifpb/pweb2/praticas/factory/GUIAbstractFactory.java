package br.edu.ifpb.pweb2.praticas.factory;

import br.edu.ifpb.pweb2.praticas.textarea.TextArea;
import br.edu.ifpb.pweb2.praticas.button.Button;
import br.edu.ifpb.pweb2.praticas.checkbox.Checkbox;

public interface GUIAbstractFactory {
    Button criarButton();
    TextArea criarTextArea();
    Checkbox criarCheckbox();
}
