package edu.marcelo.exceptions;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cep = "1234567";
            cep = formatarCep(cep);
            System.out.println(cep);
        } catch (CepInvalidoException e) {
            System.out.println("O cep deve ter 8 digitos");
        }
    }

    static String formatarCep(String cep)throws CepInvalidoException {
        if (cep.length() != 8) {

            throw new CepInvalidoException();
        }
        return "2222-22";
    }
}
