.class public Lcom/beizi/fusion/widget/dialog/dislike/a;
.super Landroid/app/Dialog;
.source "DislikeDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/widget/dialog/dislike/a$d;,
        Lcom/beizi/fusion/widget/dialog/dislike/a$b;,
        Lcom/beizi/fusion/widget/dialog/dislike/a$g;,
        Lcom/beizi/fusion/widget/dialog/dislike/a$h;,
        Lcom/beizi/fusion/widget/dialog/dislike/a$f;,
        Lcom/beizi/fusion/widget/dialog/dislike/a$e;,
        Lcom/beizi/fusion/widget/dialog/dislike/a$a;,
        Lcom/beizi/fusion/widget/dialog/dislike/a$c;
    }
.end annotation


# static fields
.field private static b:Lcom/beizi/fusion/widget/dialog/dislike/a$h;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/widget/dialog/dislike/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 p2, 0x0

    .line 2
    iput-object p2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a;->a:Ljava/util/List;

    const/4 p2, 0x1

    .line 3
    iput p2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a;->c:I

    const/4 p2, 0x2

    .line 4
    iput p2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a;->d:I

    .line 5
    invoke-direct {p0}, Lcom/beizi/fusion/widget/dialog/dislike/a;->b()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a;->a:Ljava/util/List;

    .line 6
    new-instance v0, Lcom/beizi/fusion/widget/dialog/dislike/a$h;

    invoke-direct {v0, p0, p1, p2}, Lcom/beizi/fusion/widget/dialog/dislike/a$h;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a;Landroid/content/Context;Ljava/util/List;)V

    sput-object v0, Lcom/beizi/fusion/widget/dialog/dislike/a;->b:Lcom/beizi/fusion/widget/dialog/dislike/a$h;

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/widget/dialog/dislike/a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a;->d:I

    return p0
.end method

.method static synthetic a()Lcom/beizi/fusion/widget/dialog/dislike/a$h;
    .locals 1

    .line 2
    sget-object v0, Lcom/beizi/fusion/widget/dialog/dislike/a;->b:Lcom/beizi/fusion/widget/dialog/dislike/a$h;

    return-object v0
.end method

.method static synthetic b(Lcom/beizi/fusion/widget/dialog/dislike/a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a;->c:I

    return p0
.end method

.method private b()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/widget/dialog/dislike/a$b;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v1, Lcom/beizi/fusion/widget/dialog/dislike/a$b;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a;)V

    const-string v2, "\u5185\u5bb9\u65e0\u6cd5\u6b63\u5e38\u5c55\u793a\uff08\u5361\u987f\u3001\u9ed1\u767d\u5c4f\uff09"

    .line 4
    invoke-virtual {v1, v2}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a(Ljava/lang/String;)V

    .line 5
    iget v2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a;->c:I

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a(I)V

    .line 6
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    new-instance v1, Lcom/beizi/fusion/widget/dialog/dislike/a$b;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a;)V

    const-string v2, "\u4e0d\u611f\u5174\u8da3"

    .line 8
    invoke-virtual {v1, v2}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a(Ljava/lang/String;)V

    .line 9
    iget v2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a;->c:I

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a(I)V

    .line 10
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    new-instance v1, Lcom/beizi/fusion/widget/dialog/dislike/a$b;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a;)V

    const-string v2, "\u65e0\u6cd5\u5173\u95ed"

    .line 12
    invoke-virtual {v1, v2}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a(Ljava/lang/String;)V

    .line 13
    iget v2, p0, Lcom/beizi/fusion/widget/dialog/dislike/a;->c:I

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a(I)V

    .line 14
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    new-instance v2, Lcom/beizi/fusion/widget/dialog/dislike/a$d;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/widget/dialog/dislike/a$d;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a;)V

    const-string v3, "\u7591\u4f3c\u6284\u88ad"

    .line 17
    invoke-virtual {v2, v3}, Lcom/beizi/fusion/widget/dialog/dislike/a$d;->a(Ljava/lang/String;)V

    .line 18
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    new-instance v2, Lcom/beizi/fusion/widget/dialog/dislike/a$d;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/widget/dialog/dislike/a$d;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a;)V

    const-string v3, "\u865a\u5047\u6b3a\u8bc8"

    .line 20
    invoke-virtual {v2, v3}, Lcom/beizi/fusion/widget/dialog/dislike/a$d;->a(Ljava/lang/String;)V

    .line 21
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    new-instance v2, Lcom/beizi/fusion/widget/dialog/dislike/a$d;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/widget/dialog/dislike/a$d;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a;)V

    const-string v3, "\u8fdd\u6cd5\u8fdd\u89c4"

    .line 23
    invoke-virtual {v2, v3}, Lcom/beizi/fusion/widget/dialog/dislike/a$d;->a(Ljava/lang/String;)V

    .line 24
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    new-instance v2, Lcom/beizi/fusion/widget/dialog/dislike/a$d;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/widget/dialog/dislike/a$d;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a;)V

    const-string v3, "\u4f4e\u4fd7\u8272\u60c5"

    .line 26
    invoke-virtual {v2, v3}, Lcom/beizi/fusion/widget/dialog/dislike/a$d;->a(Ljava/lang/String;)V

    .line 27
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    new-instance v2, Lcom/beizi/fusion/widget/dialog/dislike/a$b;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;-><init>(Lcom/beizi/fusion/widget/dialog/dislike/a;)V

    const-string v3, "\u4e3e\u62a5\u5e7f\u544a"

    .line 29
    invoke-virtual {v2, v3}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v2, v1}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a(Ljava/util/List;)V

    .line 31
    iget v1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a;->c:I

    invoke-virtual {v2, v1}, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a(I)V

    .line 32
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
