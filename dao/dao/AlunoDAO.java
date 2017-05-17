package dao;

import java.util.ArrayList;
import vo.AlunoVO;

public class AlunoDAO {

	public ArrayList<AlunoVO> getLista(){
		
		ArrayList<AlunoVO> alunos = new ArrayList<AlunoVO>();
		
		AlunoVO aluno1 = new AlunoVO();
		aluno1.setNome("Lucas Dharion");
		aluno1.setEmail("ladrao@hotmail.com");
		aluno1.setEndereco("lixao");		
		alunos.add(aluno1);
		
		AlunoVO aluno2 = new AlunoVO();
		aluno2.setNome("Lucas kjnkj");
		aluno2.setEmail("ladrao@hotmail.com");
		aluno2.setEndereco("lixao");
		
		alunos.add(aluno2);
		
		return alunos;
	}
	
	
	
}
