.class public final synthetic Lcom/join/kotlin/ui/userrecom/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic b:Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/userrecom/a;->b:Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/join/kotlin/ui/userrecom/a;->b:Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;

    invoke-static {v0, p1, p2}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->g0(Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
