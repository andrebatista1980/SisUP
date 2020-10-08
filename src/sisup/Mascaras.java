/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author andre
 */
public class Mascaras {

    public static MaskFormatter cpf() {
        MaskFormatter mask_cpf = null;
        try {
            mask_cpf = new MaskFormatter("###.###.###-##");
            mask_cpf.setPlaceholderCharacter('_');
        } catch (ParseException erro) {

        }
        return mask_cpf;

    }

    public static MaskFormatter cnpj() {
        MaskFormatter mask_cnpj = null;
        try {
            mask_cnpj = new MaskFormatter("##.###.###/####-##");
            mask_cnpj.setPlaceholderCharacter('_');
        } catch (ParseException erro) {

        }
        return mask_cnpj;
    }

}
