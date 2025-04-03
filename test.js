// test.js

const assert = require('assert');

// A sample function to test
function add(a, b) {
  return a + b;
}

// Test cases
try {
  assert.strictEqual(add(2, 3), 5);
  assert.strictEqual(add(-1, 1), 0);
  assert.strictEqual(add(0, 0), 0);
  console.log("✅ All tests passed!");
} catch (error) {
  console.error("❌ Test failed:");
  console.error(error.message);
}
