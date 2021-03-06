package smpl.syntax;

import smpl.semantics.*;

public abstract class Exp {

    public abstract Object visit(Visitor v, Object arg) throws Exception ;

    public abstract String toString();
}
