.class public final synthetic Lr1/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic b:Lcom/join/kotlin/quark/pop/SortPopWindow;


# direct methods
.method public synthetic constructor <init>(Lcom/join/kotlin/quark/pop/SortPopWindow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/a;->b:Lcom/join/kotlin/quark/pop/SortPopWindow;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lr1/a;->b:Lcom/join/kotlin/quark/pop/SortPopWindow;

    invoke-static {v0, p1, p2}, Lcom/join/kotlin/quark/pop/SortPopWindow;->a(Lcom/join/kotlin/quark/pop/SortPopWindow;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
