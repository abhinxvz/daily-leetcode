function isMatch(s: string, p: string): boolean {
    /*         0, 0 
     */

    p = p.replace(/\*+/g, '*');
    let dp = new Array(s.length + 1).fill(null).map(el => new Array(p.length + 1).fill(null));


    /*
        s = "cb", p = "?a"
        0, 0 

        if pChar = ? recursive s+1, p+1; 
        if pChar = '*' recursive s, p+1;  s+...n, p+1
     */

    let isGood = false;
    let recursive = (sIdx: number, pIdx: number) => {
        if (dp[sIdx][pIdx] === false) return;
        if (isGood) return;

        dp[sIdx][pIdx] = false;

        if (sIdx === s.length && pIdx === p.length) {
            isGood = true;
            return;
        }

        let sChar = s[sIdx];
        let pChar = p[pIdx];

        if (sIdx < s.length && (sChar === pChar || pChar === '?')) {
            recursive(sIdx + 1, pIdx + 1);
        } else if (pChar === '*') {
            // *
            recursive(sIdx, pIdx + 1)
            if (sIdx < s.length) {
                recursive(sIdx + 1, pIdx)
            }

        }
    }

    recursive(0, 0)

    return isGood;
};