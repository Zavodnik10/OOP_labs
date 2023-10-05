import random

n = 91  # Number of students
m = 100000  # Number of simulations

def simulate_birthday_experiment(n, m):
    count_triple_coincidence = 0
    
    for _ in range(m):
        birthdays = [random.randint(1, 365) for _ in range(n)]  # Ignoring leap years
        
        # Check if there's a triple birthday coincidence.
        if len(birthdays) != len(set(birthdays)):
            count_triple_coincidence += 1
    
    probability = count_triple_coincidence / m
    return probability

simulated_probability = simulate_birthday_experiment(n, m)

print(f"Simulated probability of a triple birthday coincidence: {simulated_probability:.4f}")
