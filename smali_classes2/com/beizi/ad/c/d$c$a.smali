.class public final Lcom/beizi/ad/c/d$c$a;
.super Ljava/lang/Object;
.source "CommonInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/c/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/beizi/ad/c/e$d;

.field private b:Lcom/beizi/ad/c/e$c;

.field private c:Lcom/beizi/ad/c/d$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/beizi/ad/c/e$c;)Lcom/beizi/ad/c/d$c$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/c/d$c$a;->b:Lcom/beizi/ad/c/e$c;

    return-object p0
.end method

.method public a(Lcom/beizi/ad/c/e$d;)Lcom/beizi/ad/c/d$c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$c$a;->a:Lcom/beizi/ad/c/e$d;

    return-object p0
.end method

.method public a()Lcom/beizi/ad/c/d$c;
    .locals 2

    .line 3
    new-instance v0, Lcom/beizi/ad/c/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/beizi/ad/c/d$c;-><init>(Lcom/beizi/ad/c/d$1;)V

    .line 4
    iget-object v1, p0, Lcom/beizi/ad/c/d$c$a;->c:Lcom/beizi/ad/c/d$b;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$c;->a(Lcom/beizi/ad/c/d$c;Lcom/beizi/ad/c/d$b;)Lcom/beizi/ad/c/d$b;

    .line 5
    iget-object v1, p0, Lcom/beizi/ad/c/d$c$a;->a:Lcom/beizi/ad/c/e$d;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$c;->a(Lcom/beizi/ad/c/d$c;Lcom/beizi/ad/c/e$d;)Lcom/beizi/ad/c/e$d;

    .line 6
    iget-object v1, p0, Lcom/beizi/ad/c/d$c$a;->b:Lcom/beizi/ad/c/e$c;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/d$c;->a(Lcom/beizi/ad/c/d$c;Lcom/beizi/ad/c/e$c;)Lcom/beizi/ad/c/e$c;

    return-object v0
.end method
