from sklearn import datasets
from sklearn.model_selection import train_test_split
from sklearn import tree
from sklearn.metrics import accuracy_score
import pandas as pd
# import matplotlib.pyplot as plt


iris = datasets.load_iris()
df = pd.DataFrame(iris.data, columns=iris.feature_names)
print(df.head())

df['species'] = iris.target
x = df[['petal width (cm)', 'petal length (cm)', ]]
y = df['species']

x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=42)
clf = tree.DecisionTreeClassifier()
clf = clf.fit(x_train, y_train)

y_pred = clf.predict(x_test)

# Evaluate the accuraxy

accuracy = accuracy_score(y_test, y_pred)
print("Accuracy:", accuracy)





# Followiung code to visualize data

# _, ax = plt.subplots()
# scatter = ax.scatter(iris.data[:, 0], iris.data[:, 1], c=iris.target)
# ax.set(xlabel=iris.feature_names[0], ylabel=iris.feature_names[1])
# _ = ax.legend(
#     scatter.legend_elements()[0], iris.target_names, loc="lower right", title="Classes"
# )
