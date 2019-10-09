<h1>Exemple d’utilisation</h1>

Exemples d’utilisation de notre langage pour mettre en avant les possibilités proposés par ce dernier. Chaque exemple sera accompagné de son programme python.

<h3>Exemple 1 : TrainingTest, treeDecision</h3>
<b>Version MYST</b></br>
CSV iris</br>
parse variety</br>
trainingTest 0.3,DecisionTreeClassifier</br>
showPrecision</br></br>

<b>Version Python</b></br>
df = pd.read_csv("iris.csv")</br>
X = df.drop(columns=["variety"])</br>
y = df["variety"]</br>
test_size = 0.3</br>
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=test_size)</br>
clf = tree.DecisionTreeClassifier()</br>
clf.fit(X_train, y_train)</br>
precision = precision_score(y_test, clf.predict(X_test))</br>
print(precision)</br></br>

<h3>Exemple 2: TrainingTest , SVM</h3></br>
<b>Version MYST</b></br>
CSV iris</br>
parse</br>
trainingTest 0.2,SupportVectorMachines</br>
showRecall</br></br>

<b>Version Python</b></br>
from sklearn.svm import SVC</br>
df = pd.read_csv("iris.csv")</br>
X = df.drop(columns=["variety"])</br>
y = df["variety"]</br>
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size = 0.20)</br>
clf = LinearSVC()</br>
clf.fit(X_train, y_train) </br>
recall = recall_score(y_test, clf.predict(X_test))</br>
print(recall)</br></br>

<h3>Exemple 3: TrainingTest, QuadraticDiscriminantAnalysis</h3></br>
<b>Version MYST</b></br>
CSV iris</br>
parse variety</br>
CrossValidation,QuadraticDiscriminantAnalysis</br>
showPrecision</br></br>

<b>Version Python</b></br>
df = pd.read_csv("iris.csv")</br>
X = df.drop(columns=["variety"])</br>
y = df["variety"]</br>
test_size = 0.3</br>
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=test_size)</br>
clf = tree.QuadraticDiscriminantAnalysis()</br>
clf.fit(X_train, y_train)</br>
precision = precision_score(y_test, clf.predict(X_test))</br>
print(precision)</br></br>

<h3>Exemple 4: Cross validation, TreeDecision</h3></br>
<b>Version MYST</b></br>
CSV iris “variety”</br>
CrossValidation,DecisionTree</br>
showAccuracy</br></br>

<b>Version Python</b></br>
df = pd.read_csv("iris.csv")</br>
X = df.drop(columns=["variety"])</br>
y = df["variety"]</br>
clf = tree.DecisionTreeClassifier()</br>
clf.fit(X, y)</br>
scores = cross_val_score(clf  X, y)</br>
accuracy= scores.mean()</br>
print(accuracy)</br></br>

<h3>Exemple 5: Cross validation, SVM</h3></br>
<b>Version MYST</b></br>
CSV iris</br>
parse</br>
CrossValidation SupportVectorMachines</br>
showAccuracy</br></br>

<b>Version Python</b></br>
df = pd.read_csv("iris.csv")</br>
X = df.drop(df.columns[len(df.columns)-1])</br>
y = df[df.columns[len(df.columns)-1]]</br>
clf = svm.SVC()</br>
scores = cross_val_score(clf, X, y)</br>
accuracy= scores.mean()</br>
print(accuracy)</br></br>



<h3>Exemple 6: Cross validation, Neural network models</h3></br>
<b>Version MYST</b></br>
CSV iris</br>
parse</br>
CrossValidation NeutralNetwork</br>
showRecall</br></br>

<b>Version Python</b></br>
df = pd.read_csv("iris.csv")</br>
X = df.drop(df.columns[len(df.columns)-1])</br>
y = df[df.columns[len(df.columns)-1]]</br>
clf = MLPClassifier()</br>
scores = cross_val_score(clf, X, y)</br>
accuracy = scores.mean()</br>
print(accuracy)</br></br>

<h3>Exemple 7: TrainingTest, Neural network models</h3></br>
<b>Version MYST</b></br>
CSV iris</br>
parse</br>
TrainingTest, 0.3,NeutralNetwork</br>
showRecall</br></br>

<b>Version Python</b></br>
df = pd.read_csv("iris.csv")</br>
X = df.drop(df.columns[len(df.columns)-1])</br>
y = df[df.columns[len(df.columns)-1]]</br>
test_size = 0.3</br>
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=test_size)</br>
clf = MLPClassifier()</br>
recall = recall_score(y_test, clf.predict(X_test))</br>
print(recall)</br></br>

<h3>Exemple 8: TrainingTest, LinearDiscriminantAnalysis</h3></br>
<b>Version MYST</b></br>
CSV iris</br>
parse</br>
TrainingTest, 0.3,LinearDiscriminantAnalysis</br>
showRecall</br></br>

<b>Version Python</b></br>
df = pd.read_csv("iris.csv")</br>
X = df.drop(df.columns[len(df.columns)-1])</br>
y = df[df.columns[len(df.columns)-1]]</br>
test_size = 0.3</br>
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=test_size)</br>
clf = LinearDiscriminantAnalysis()</br>
recall = recall_score(y_test, clf.predict(X_test))</br>
print(recall)</br></br>

<h3>Exemple 9: TrainingTest, AdaBoostClassifier</h3></br>
<b>Version MYST</b></br>
CSV iris</br>
parse</br>
TrainingTest, 0.3,Boosting</br>
showRecall</br></br>

<b>Version Python</b></br>
df = pd.read_csv("iris.csv")</br>
X = df.drop(df.columns[len(df.columns)-1])</br>
y = df[df.columns[len(df.columns)-1]]</br>
test_size = 0.3</br>
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=test_size)</br>
clf = AdaBoostClassifier()</br>
recall = recall_score(y_test, clf.predict(X_test))</br>
print(recall)</br></br>

<h3>Exemple 10: Cross validation, AdaBoostClassifier</h3></br>
<b>Version MYST</b></br>
CSV iris</br>
parse</br>
TrainingTest, 0.3,Boosting</br>
showAccuracy</br></br>

<b>Version Python</b></br>
df = pd.read_csv("iris.csv")</br>
X = df.drop(df.columns[len(df.columns)-1])</br>
y = df[df.columns[len(df.columns)-1]]</br>
clf = AdaBoostClassifier()</br>
scores = cross_val_score(clf, X, y)</br>
accuracy = scores.mean()</br>
print(accuracy)</br></br>


