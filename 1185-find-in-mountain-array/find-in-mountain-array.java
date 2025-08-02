/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length()-1;
        int peak = peakEl(mountainArr);
        int first = search(target, mountainArr, 0, peak, true);
        if(first!=-1) {
            return first;
        }
        return search(target, mountainArr, peak+1, n, false);
    }

    static int peakEl(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length()-1;
        while(start<end) {
            int mid = (start+end)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1)) {
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }

    static int search(int target, MountainArray mountainArr, int start, int end, boolean isAsc) {
        while(start<=end) {
            int mid = (start+end)/2;
            if(mountainArr.get(mid)==target) {
                return mid;
            }
            if(isAsc) {
                if(mountainArr.get(mid)<target) {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else {
                if(mountainArr.get(mid)>target) {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}


