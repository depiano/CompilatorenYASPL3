/**
 * 
 * @author Antonio De Piano
 * eMail: depianoantonio@gmail.com
 * web site: http://www.depiano.it
 *
 */
package SyntaxTree;

import Visitor.Visitor;

public class WriteOp extends OpNode {

	public WriteOp(String op, OpNode args) {
		super(op, args);
		
	}
	public Object accept(Visitor v) throws Exception{
		return v.visit(this);
	}

}
