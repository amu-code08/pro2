class CharSet{
	char[] array;

	void init(){
		array = new char[]{0,0,0,0};
	}

	int count(){
		int op=0;
		for(int i = 0; i<array.length; i++){
			if(array[i] == 0 | array[i] == '0'){
				op +=1;
			}
		}
		return 4-op;
	}

	boolean search(char x){
		for(int i = 0; i<array.length; i++){
			if(array[i] == x){
				return true;
			}
		}

		return false;
	}

	void add(char x){
		if(count()<4){
			if(!search(x)){
				for(int i = 0; i<array.length; i++){
					if(array[i]==0){
						array[i] = x;
						return;
					}
				} 
				array[0] = x;
			}
		}
	}

	void remove(char x){
		for(int i = 0; i<array.length; i++){
			if(array[i] == x){
				array[i]=0;
				return;
			}
		}
	}
}