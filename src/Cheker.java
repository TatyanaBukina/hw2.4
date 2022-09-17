public interface Cheker {
    boolean check(String s);

    boolean check(String s, boolean login) throws WrongLoginExeption,WrongPasswordExeption;
}

