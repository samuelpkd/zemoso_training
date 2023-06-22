class EngineFailureException extends Exception {
    
    EngineFailureException(String message) {
        super(message);
    }
}

class FuelDeficetException extends Exception {
    
    FuelDeficetException(String message) {
        super(message);
    }
}

class TyrePunctureException extends Exception {
    
    TyrePunctureException(String message) {
        super(message);
    }
}

class MotorCycle {
    
    void getMotorCycleStatus( boolean is_engine_failure,boolean fuel_deficet) throws EngineFailureException,FuelDeficetException,TyrePunctureException{
        
        if(is_engine_failure) {
                throw new EngineFailureException("Engine failed");
        }else if(fuel_deficet) {
                throw new FuelDeficetException("Fuel deficit");
        } else {
                throw new TyrePunctureException("Tyre got punctured");
        }
        
    }
}

class MotorCycleCaller  {
    
    public static void main(String args[]) {
        
        try {
            MotorCycle cycle = new MotorCycle();
            cycle.getMotorCycleStatus(true,true);
        } catch (Exception  exception) {
            System.out.println(exception);
        } finally {
            System.out.println("Status Updated in case of failure");
        }
    }
}
