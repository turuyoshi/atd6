public class App
{
    public static void main(String[] args)
    {
        Pilha pilha = new Pilha();

        pilha.push('@');
        pilha.push('&');
        pilha.push('@');
        pilha.push('#');
        pilha.push('%');
        pilha.push('&');
        pilha.push('$');

        System.out.println("Pilha original:");
        pilha.print();

        ExcluirPilha.removeCaracteresRepetidos(pilha);

        System.out.println("Pilha após remover caracteres repetidos:");
        pilha.print();
    }
}
