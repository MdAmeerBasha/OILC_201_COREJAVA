package assignment_19_june8th;

class LeaveQuotaExceededException extends Exception {
	public LeaveQuotaExceededException(String mess) {
		super(mess);
	}
}

public class LeaveSystem {
	int total_leaves;

	public LeaveSystem(int total_leaves) {
		try

		{

			if (total_leaves > 20) {
				throw new LeaveQuotaExceededException(
						"your Leaves are Exceeded, so you can't apply for Leave in your Quota");
			} else {
				System.out.println("your  leave is Sanctioned , Remaining leaves you have only : " + (20 - total_leaves)
						+ " leaves in you quato");
			}
		} catch (LeaveQuotaExceededException e) {
			System.out.println(e.getMessage());
		}
	}

}
