import unittest
from health_calculator import HealthCalculator

class TestHealthCalculator(unittest.TestCase):

    def test_invalid_height(self):
        # Given
        health_calculator = HealthCalculator()
       
        # When
        result = health_calculator.compute_basal_metabolic_rate(height=-1)
       
        # Then
        self.assertRaises(Exception, result)

    def test_invalid_gender(self):
        # Given
        health_calculator = HealthCalculator()
       
        # When
        result = health_calculator.compute_basal_metabolic_rate(gender="invalid")
       
        # Then
        self.assertRaises(Exception, result)

    def test_invalid_age(self):
        # Given
        health_calculator = HealthCalculator()
       
        # When
        result = health_calculator.compute_basal_metabolic_rate(age=-1)
       
        # Then
        self.assertRaises(Exception, result)

    def test_invalid_weight(self):
        # Given
        health_calculator = HealthCalculator()
       
        # When
        result = health_calculator.compute_basal_metabolic_rate(weight=-1)
       
        # Then
        self.assertRaises(Exception, result)

    def test_negative_result_for_weight(self):
        # Given
        health_calculator = HealthCalculator()
       
        # When
        result = health_calculator.compute_basal_metabolic_rate(height=160, weight=40, age=30, gender="female")
       
        # Then
        self.assertRaises(Exception, result)

    def test_valid_parameters(self):
        # Given
        health_calculator = HealthCalculator()
       
        # When
        result = health_calculator.compute_basal_metabolic_rate(height=170, weight=65, age=25, gender="male")
       
        # Then
        self.assertIsNotNone(result)


if __name__ == '__main__':
    unittest.main()
