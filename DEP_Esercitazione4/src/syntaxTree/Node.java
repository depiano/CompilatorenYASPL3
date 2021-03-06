/**
 * 
 * @author Antonio De Piano
 * eMail: depianoantonio@gmail.com
 * web site: http://www.depiano.it
 *
 */

package syntaxTree;

import visitor.Visitor;

public class Node {


		private String op;
		
		public Node(String op){
			this.op = op;
		}
		
		public Object accept(Visitor v){
			return v.visit(this);
		}
		
		public String getOp() {
			return op;
		}
		public void setOp(String op) {
			this.op = op;
		}
	}


