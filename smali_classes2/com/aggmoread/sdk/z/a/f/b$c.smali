.class Lcom/aggmoread/sdk/z/a/f/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/f/b;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/f/b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/f/b;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/f/b$c;->a:Lcom/aggmoread/sdk/z/a/f/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollChanged()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/f/b$c;->a:Lcom/aggmoread/sdk/z/a/f/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/f/b;->a(Lcom/aggmoread/sdk/z/a/f/b;)Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/f/b;->a(Lcom/aggmoread/sdk/z/a/f/b;Landroid/view/View;)V

    return-void
.end method
