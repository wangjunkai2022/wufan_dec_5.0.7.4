.class public final Lcom/airsaid/pickerviewlibrary/R$styleable;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airsaid/pickerviewlibrary/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final PickerView_Library:[I

.field public static final PickerView_Library_pickerview_dividerColor:I = 0x0

.field public static final PickerView_Library_pickerview_gravity:I = 0x1

.field public static final PickerView_Library_pickerview_textColorCenter:I = 0x2

.field public static final PickerView_Library_pickerview_textColorOut:I = 0x3

.field public static final PickerView_Library_pickerview_textSize:I = 0x4


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/airsaid/pickerviewlibrary/R$styleable;->PickerView_Library:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f0404af
        0x7f0404b0
        0x7f0404b1
        0x7f0404b2
        0x7f0404b3
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
