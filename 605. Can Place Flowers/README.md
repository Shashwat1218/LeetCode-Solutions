import os
import subprocess

# Replace these variables with your specific details
GIT_REPO_PATH = "D:\GIT\LeetCode-Solutions"  # Path to your Git folder
GITHUB_REPO = "https://github.com/Shashwat1218/LeetCode-Solutions.git"

def create_readme(problem_number, problem_name, problem_description, examples, constraints):
    readme_content = f"# {problem_number}. {problem_name}\n\n"
    readme_content += "## Description\n\n"
    readme_content += problem_description.strip() + "\n\n"
    readme_content += "### Examples\n\n"
    
    for example in examples:
        readme_content += f"#### Example {example['number']}:\n"
        readme_content += f"- **Input**: `{example['input']}`\n"
        readme_content += f"- **Output**: `{example['output']}`\n"
        readme_content += "- **Explanation**:\n"
        for explanation in example['explanation']:
            readme_content += f"  - {explanation}\n"
        readme_content += "\n"
    
    readme_content += "### Constraints\n\n"
    readme_content += constraints.strip() + "\n"
    
    return readme_content

def create_solution_file(solution_code):
    return solution_code

def automate_github_update(problem_number, problem_name, problem_description, examples, constraints, solution_code):
    problem_folder = f"{problem_number}. {problem_name}"
    readme_content = create_readme(problem_number, problem_name, problem_description, examples, constraints)
    solution_content = create_solution_file(solution_code)
    
    os.chdir(GIT_REPO_PATH)
    
    # Create new folder if it doesn't exist
    if not os.path.exists(problem_folder):
        os.makedirs(problem_folder)
    
    # Create README.md file
    with open(os.path.join(problem_folder, "README.md"), "w") as readme_file:
        readme_file.write(readme_content)
    
    # Create Solution.java file
    with open(os.path.join(problem_folder, "Solution.java"), "w") as solution_file:
        solution_file.write(solution_content)
    
    # Git commands to add, commit, and push changes
    subprocess.run(["git", "add", "."])
    commit_message = f"Add {problem_number}. {problem_name}"
    subprocess.run(["git", "commit", "-m", commit_message])
    
    # Use token for authentication
    repo_url_with_token = GITHUB_REPO.replace("https://", f"https://{GITHUB_TOKEN}@")
    subprocess.run(["git", "push", repo_url_with_token])

# Example usage for Problem 1768: Merge Strings Alternately
problem_number = 1768
problem_name = "Merge Strings Alternately"
problem_description = """
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
"""
examples = [
    {
        "number": 1,
        "input": 'word1 = "abc", word2 = "pqr"',
        "output": '"apbqcr"',
        "explanation": [
            'The merged string will be merged as so:',
            'word1:  a   b   c',
            'word2:    p   q   r',
            'merged: a p b q c r'
        ]
    },
    {
        "number": 2,
        "input": 'word1 = "ab", word2 = "pqrs"',
        "output": '"apbqrs"',
        "explanation": [
            'Notice that as word2 is longer, "rs" is appended to the end.',
            'word1:  a   b ',
            'word2:    p   q   r   s',
            'merged: a p b q   r   s'
        ]
    },
    {
        "number": 3,
        "input": 'word1 = "abcd", word2 = "pq"',
        "output": '"apbqcd"',
        "explanation": [
            'Notice that as word1 is longer, "cd" is appended to the end.',
            'word1:  a   b   c   d',
            'word2:    p   q ',
            'merged: a p b q c   d'
        ]
    }
]
constraints = """
- 1 <= word1.length, word2.length <= 100
- word1 and word2 consist of lowercase English letters
"""
solution_code = """
public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            mergedString.append(word1.charAt(i++));
            mergedString.append(word2.charAt(j++));
        }
        while (i < word1.length()) {
            mergedString.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            mergedString.append(word2.charAt(j++));
        }
        return mergedString.toString();
    }
}
"""

# Call the automate_github_update function for Problem 1768: Merge Strings Alternately
automate_github_update(problem_number, problem_name, problem_description, examples, constraints, solution_code)
