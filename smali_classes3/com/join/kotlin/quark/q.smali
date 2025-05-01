.class public final synthetic Lcom/join/kotlin/quark/q;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic b:Lcom/join/kotlin/quark/SourceShareActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/join/kotlin/quark/SourceShareActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/quark/q;->b:Lcom/join/kotlin/quark/SourceShareActivity;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/join/kotlin/quark/q;->b:Lcom/join/kotlin/quark/SourceShareActivity;

    invoke-static {v0, p1, p2, p3}, Lcom/join/kotlin/quark/SourceShareActivity;->g0(Lcom/join/kotlin/quark/SourceShareActivity;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
