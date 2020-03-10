from flask import Flask, render_template, url_for, redirect

app = Flask(__name__)


@app.route('/')
def hello_world():
    return redirect("/dummy")


@app.route('/dummy')
def dummy():
    static = url_for('static', filename='style.css')
    jquery = url_for('static', filename='jquery-3.3.1.min.js')
    show = url_for('static', filename='show.js')

    return render_template("page.html", static=static, jquery=jquery, show = show)


if __name__ == '__main__':
    app.debug = True
    app.run()
