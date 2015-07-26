public class Calculator{
	
	//Результат вычисления
	private int result;
	
	//Суммируем аргументы
	public void add(int ... params){
		for(Integer param : params){
			this.result += param;
		}
	}
	//Вычитаем параметры
	public void subtraction(int ... params){
		for(Integer param : params){
			this.result -= param;
		}
	}
	
	//Получить результат
	public int getResult(){
		return this.result;
	}
	
	//Очистить результат
	public void cleanResult(){
		this.result = 0;
	}
}