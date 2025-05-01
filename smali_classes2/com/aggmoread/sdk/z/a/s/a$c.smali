.class Lcom/aggmoread/sdk/z/a/s/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/s/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/s/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/s/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$c;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$c;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/a;->d(Lcom/aggmoread/sdk/z/a/s/a;)Lcom/aggmoread/sdk/z/a/s/a$g;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$c;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/a;->h(Lcom/aggmoread/sdk/z/a/s/a;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$c;->a:Lcom/aggmoread/sdk/z/a/s/a;

    const/16 v0, 0xbb8

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/z/a/s/a;->a(I)V

    :cond_0
    return-void
.end method
