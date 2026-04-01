var survivedRobotsHealths = function(positions, healths, directions) {
    let robots = positions.map((p, i) => [p, healths[i], directions[i], i]);
    robots.sort((a, b) => a[0] - b[0]);

    let stack = [];

    for (let i = 0; i < robots.length; i++) {
        if (robots[i][2] === 'R') stack.push(i);
        else {
            while (stack.length && robots[i][1] > 0) {
                let j = stack[stack.length - 1];
                if (robots[j][1] < robots[i][1]) {
                    stack.pop();
                    robots[i][1]--;
                    robots[j][1] = 0;
                } else if (robots[j][1] > robots[i][1]) {
                    robots[j][1]--;
                    robots[i][1] = 0;
                    break;
                } else {
                    robots[j][1] = 0;
                    robots[i][1] = 0;
                    stack.pop();
                    break;
                }
            }
        }
    }

    return robots
        .filter(r => r[1] > 0)
        .sort((a, b) => a[3] - b[3])
        .map(r => r[1]);
};