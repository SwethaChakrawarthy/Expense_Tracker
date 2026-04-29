import org.example.Expense;
import org.example.ExpenseManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class ExpenseManagerTest {
    @Test
    void totalExpenses_threeExpenses_returnsCorrectSum(){
        //arrange
        Expense obj2 =  new Expense("de","we",10, LocalDate.now());
        Expense obj1 =  new Expense("de","we",20, LocalDate.now());
        Expense obj3 =  new Expense("de","we",20, LocalDate.now());
        ExpenseManager exp = new ExpenseManager();
        //act
        exp.addExpense(obj2);
        exp.addExpense(obj1);
        exp.addExpense(obj3);
        //assert
        assertEquals(50.0,exp.totalExpenses());
    }
    @Test
    void totalExpenses_noExpenses_returnsCorrectSum(){
        //arrange
        ExpenseManager exp = new ExpenseManager();
        assertEquals(0.0,exp.totalExpenses());
    }
    @Test
    void addexpense_oneexpense_listsize(){
        Expense obj2 = new Expense("de","we",10, LocalDate.now());
        ExpenseManager exp = new ExpenseManager();
        exp.addExpense(obj2);
        assertEquals(1,exp.getAllExpenses().size());
    }
    @Test
    void amount_negative_exception(){
        assertThrows(IllegalArgumentException.class, ()->{new Expense("de","we",-10, LocalDate.now());});;
    }
}

