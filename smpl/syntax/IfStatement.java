package smpl.syntax;

import smpl.semantics.*;

public class IfStatement extends Statement {

    private Exp condition;
    private Exp body;
    private Exp els;

    public IfStatement(Exp cond, Exp bod, Exp other) {
        this.condition = cond;
        this.body = bod;
        this.els = other;
    }

    public IfStatement(Exp cond, Exp bod) {
        this.condition = cond;
        this.body = bod;
        this.els = null;
    }

    public Exp getCond() {
        return condition;
    }

    public Exp getBody(){
        return body;
    }

    public Exp getElse(){
        return els;
    }

    @Override
    public Object visit(Visitor v, Object arg) throws Exception
    {
	       return v.visitIfStatement(this, arg);
    }

}
