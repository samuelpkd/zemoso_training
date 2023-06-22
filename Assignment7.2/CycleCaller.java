class CycleCaller {
    public static void main(String[] args) {
        Cycle cycle_list[] = { new Bicycle() , new Tricycle() , new Unicycle() };
        for( Cycle cycle : cycle_list ) {
            if(cycle instanceof Bicycle) {
                ((Bicycle)cycle).balance();    
            } else if (cycle instanceof Unicycle) {
                ((Unicycle)cycle).balance();
            } 
        }
    }
} 
