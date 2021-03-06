public class ConvertSortedArraytoBinarySearchTree{
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = help(nums,0,nums.length-1);
        return root;
    }
    public TreeNode help(int[] nums, int low, int high){
        if(low>high)
            return null;
        int mid = low + (high-low)/2;
    	TreeNode node = new TreeNode(nums[mid]);
		node.left = help(nums,low,mid-1);
		node.right = help(nums,mid+1,high);
    	return node;
    }
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}