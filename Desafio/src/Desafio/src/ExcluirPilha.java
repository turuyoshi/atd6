public class ExcluirPilha

{
    public static void removeCaracteresRepetidos(Pilha pilha)
    {
        Pilha pilhaAuxiliar = new Pilha();
        Pilha pilhaFinal = new Pilha(); 

        while (!pilha.isEmpty())
        {
            char valor = pilha.pop();

            if (!contains(pilhaAuxiliar, valor))
            {
                pilhaAuxiliar.push(valor);
                pilhaFinal.push(valor);
            }
        }

        while (!pilhaFinal.isEmpty())
        {
            pilha.push(pilhaFinal.pop());
        }
    }

    private static boolean contains(Pilha pilha, char valor)
    {
        Pilha temp = new Pilha();
        boolean found = false;

        while (!pilha.isEmpty())
        {
            char current = pilha.pop();
            temp.push(current);

            if (current == valor)
            {
                found = true;
                break;
            }
        }

        while (!temp.isEmpty())
        {
            pilha.push(temp.pop());
        }

        return found;
    }
}
